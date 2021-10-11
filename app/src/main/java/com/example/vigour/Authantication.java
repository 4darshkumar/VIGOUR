package com.example.vigour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Authantication extends AppCompatActivity {

    EditText countryCode,phoneNumber,enterOTP;
    Button sendOTPBtn,verifyOTP;
    TextView resendOTP,skip;
    String userPhoneNumber,verificationId;
    PhoneAuthProvider.ForceResendingToken token;
    FirebaseAuth fAuth;
    PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authantication);
        getSupportActionBar().hide();

        countryCode = findViewById(R.id.cc);
        phoneNumber = findViewById(R.id.phonenumber);
        sendOTPBtn =  findViewById(R.id.sendOTPBtn);
        skip = findViewById(R.id.skip);

        enterOTP = findViewById(R.id.enterOTP);
        verifyOTP = findViewById(R.id.verifyOTP);
        resendOTP = findViewById(R.id.resendOTP);
        resendOTP.setEnabled(false);

        fAuth = FirebaseAuth.getInstance();

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Authantication.this, MainActivity.class);
                startActivity(intent);
            }
        });

        sendOTPBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countryCode.getText().toString().isEmpty()){
                    countryCode.setError("Required");
                    return;
                }

                if (phoneNumber.getText().toString().isEmpty()){
                    phoneNumber.setError("Phone Number is Required.");
                    return;
                }
                userPhoneNumber = "+"+countryCode.getText().toString()+phoneNumber.getText().toString();
                verifyPhoneNumber(userPhoneNumber);

                Toast.makeText(Authantication.this,userPhoneNumber, Toast.LENGTH_SHORT).show();
            }
        });

        resendOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyPhoneNumber(userPhoneNumber);
                resendOTP.setEnabled(false);
            }
        });

        verifyOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterOTP.getText().toString().isEmpty()){
                    enterOTP.setError("Enter OTP");
                    return;
                }
                PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId,enterOTP.getText().toString());
                authenticateUser(credential);
            }
        });

        callbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                authenticateUser(phoneAuthCredential);

            }

            @Override
            public void onVerificationFailed(@NonNull FirebaseException e) {
                Toast.makeText(Authantication.this,e.getMessage(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(s, forceResendingToken);
                verificationId = s;
                token = forceResendingToken;

                countryCode.setVisibility(View.GONE);
                phoneNumber.setVisibility(View.GONE);
                sendOTPBtn.setVisibility(View.GONE);

                enterOTP.setVisibility(View.VISIBLE);
                verifyOTP.setVisibility(View.VISIBLE);
                resendOTP.setVisibility(View.VISIBLE);
                resendOTP.setEnabled(false);

            }

            @Override
            public void onCodeAutoRetrievalTimeOut(@NonNull String s) {
                super.onCodeAutoRetrievalTimeOut(s);
                resendOTP.setEnabled(true);

            }
        };




    }
    public void verifyPhoneNumber(String phoneNum){

        PhoneAuthOptions options = PhoneAuthOptions.newBuilder(fAuth)
                .setActivity(this)
                .setPhoneNumber(phoneNum)
                .setTimeout(60L, TimeUnit.SECONDS)
                .setCallbacks(callbacks)
                .build();

        PhoneAuthProvider.verifyPhoneNumber(options);

    }

    public void authenticateUser(PhoneAuthCredential credential){
        fAuth.signInWithCredential(credential).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(Authantication.this,"Success",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }
}
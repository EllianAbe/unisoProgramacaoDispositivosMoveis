package com.uniso.lpdm.mensageiroemaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnviarMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_mensagem);
    }

    public void onClickSendMessage(View view) {
        EditText editText =  (EditText) findViewById(R.id.editMessage);
        String message = editText.getText().toString();
    }
}
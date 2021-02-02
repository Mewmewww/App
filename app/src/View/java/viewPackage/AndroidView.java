package viewPackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.app.R;

public class AndroidView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setText(View view){
        TextView textView = findViewById(R.id.textView3);
        EditText editText = findViewById(R.id.editTextTextPersonName2);
        textView.setText(editText.getEditableText());
    }
}
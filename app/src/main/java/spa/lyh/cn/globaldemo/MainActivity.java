package spa.lyh.cn.globaldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button local_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void initView(){
        local_click = findViewById(R.id.local_click);
        local_click.setOnClickListener(this);
    }

    private void loadData(){
        String content = getString(R.string.enter);
        Log.e("qwer","内容为："+content);
        local_click.setText(content);
    }

    @Override
    public void onClick(View v) {

    }
}
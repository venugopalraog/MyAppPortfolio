package myapp.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        findViewById(R.id.btn_app_material).setOnClickListener(this);
        findViewById(R.id.btn_build_bigger).setOnClickListener(this);
        findViewById(R.id.btn_capstone).setOnClickListener(this);
        findViewById(R.id.btn_popular_movies).setOnClickListener(this);
        findViewById(R.id.btn_stock_hawk).setOnClickListener(this);
        findViewById(R.id.btn_ubiquitous).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String toastTxt;

        switch (v.getId()) {
            case R.id.btn_app_material:
                toastTxt = "This button will launch make your app material app!";
                break;
            case R.id.btn_build_bigger:
                toastTxt = "This button will launch build it bigger app!";
                break;
            case R.id.btn_capstone:
                toastTxt = "This button will launch capstone app!";
                break;
            case R.id.btn_popular_movies:
                toastTxt = "This button will launch popular movies app!";
                break;
            case R.id.btn_stock_hawk:
                toastTxt = "This button will launch stock hawk app!";
                break;
            case R.id.btn_ubiquitous:
                toastTxt = "This button will launch ubiquitous app!";
                break;
            default:
                toastTxt ="Default case: No Id match";
        }

        Toast.makeText(this, toastTxt, Toast.LENGTH_SHORT).show();
    }
}

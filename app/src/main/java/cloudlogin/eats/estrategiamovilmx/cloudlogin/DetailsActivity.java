package cloudlogin.eats.estrategiamovilmx.cloudlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.cloudrail.si.CloudRail;
import com.eats.estrategiamovilmx.cloudlogin.R;

import cloudlogin.eats.estrategiamovilmx.enums.SocialMediaProvider;
import cloudlogin.eats.estrategiamovilmx.model.UserAccount;
import cloudlogin.eats.estrategiamovilmx.service.LoginService;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent i = getIntent();
        UserAccount account = (UserAccount) i.getParcelableExtra(LoginService.EXTRA_SOCIAL_ACCOUNT);
        TextView text_full_name = (TextView) findViewById(R.id.text_full_name);
        TextView text_email = (TextView) findViewById(R.id.text_email);
        if (account !=null){
            Log.d("Account","Nombre:"+account.getFullName()+ "Email:"+account.getEmail());
            text_full_name.setText(account.getFullName());
            text_email.setText(account.getEmail());
        }
    }


}

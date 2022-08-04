package sg.edu.np.mad.exercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    User u = new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Debug", "create");

        Intent rec = getIntent();
        int value = rec.getIntExtra("id",0);
        //for(int i = 0; i < ListActivity.userList.size(); i++){
        //    u = ListActivity.userList.get(i);
        //}
        u.setName("MAD");
        u.setDesc("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        u.setID(1);
        u.setFollowed(false);

        TextView name = findViewById(R.id.txtName);
        name.setText(u.getName());
        TextView description = findViewById(R.id.txtDescription);
        description.setText(u.getDesc());
        setFollowBtn();
    }

    private void setFollowBtn() {
        Button b = findViewById(R.id.btnFollow);
        if(u.followed) {
            b.setText("Unfollow");
        }
        else {
            b.setText("Follow");
        }
    }
    public void onFollowClick(View v) {
        u.followed = !u.followed;
        if(u.followed)
            Toast.makeText(this, "Followed", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Unfollowed", Toast.LENGTH_SHORT).show();
        setFollowBtn();
    }
}
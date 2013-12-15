package com.gibsson.basic.client;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

import com.gibsson.basic.service.lib.BasicManager;

public class BasicActivity extends Activity implements OnClickListener {

  private TextView output;

  private final Random random = new Random();
  private final BasicManager bm = BasicManager.getInstance();

  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    super.setContentView(R.layout.basic);
    this.output = (TextView)super.findViewById(R.id.output);
    Button button = (Button)super.findViewById(R.id.button);
    button.setOnClickListener(this);
  }

  private void updateOutput(int newValue) {
    this.output.setText(super.getString(R.string.message,
                        newValue, this.bm.getValue()));
  }

  @Override
  public void onResume() {
    super.onResume();
    this.bm.setValue(0);
    this.updateOutput(0);
  }

  @Override
  public void onPause() {
    super.onPause();
  }

  @Override
  public void onClick(View view) {
    int value = this.random.nextInt();
    this.bm.setValue(value);
    this.updateOutput(value);
  }
}

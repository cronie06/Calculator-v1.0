package com.mycompany.calculator;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.view.View.*;
import android.content.*;
import javax.security.auth.*;
import android.inputmethodservice.*;
import java.security.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	
	private RadioButton rb1;
	private RadioButton rb2;
	private RadioGroup rg1;
	
	private Button btnplus;
	private Button btnmns;
	private Button btntms;
	private Button btndiv;
	
	private Button btndot;
	private Button btneqls;
	private Button btnexit;
	private Button btnrst;
	private TextView tv;
	private TextView tv2;
	private TextView tv3;
	
	String str;
	Double ans,num;
	int calculation,c=0,x=0,y=0;
	
	
	
	public void arithmetic_operation(){
		switch(calculation){
			case 1:
				
				ans = num + Double.parseDouble(((tv.getText().toString())));
				tv.setText(Double.toString(ans));
				break;
				
			case 2:
				
				ans = (num) - (Double.parseDouble(((tv.getText().toString()))));
				tv.setText(Double.toString(ans));
				break;
				
			case 3:

				ans = num * Double.parseDouble(((tv.getText().toString())));
				tv.setText(Double.toString(ans));
				break;
				
			case 4:

				ans = num / Double.parseDouble(((tv.getText().toString())));
				tv.setText(Double.toString(ans));
				break;
				
		}
		
		
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		
		tv = (TextView)findViewById(R.id.tv);
		tv3 = (TextView)findViewById(R.id.tv3);
		btn1 = (Button)findViewById(R.id.btn1);
		btn2 = (Button)findViewById(R.id.btn2);
		btn3 = (Button)findViewById(R.id.btn3);
		btn4 = (Button)findViewById(R.id.btn4);
		btn5 = (Button)findViewById(R.id.btn5);
		btn6 = (Button)findViewById(R.id.btn6);
		btn7 = (Button)findViewById(R.id.btn7);
		btn8 = (Button)findViewById(R.id.btn8);
		btn9 = (Button)findViewById(R.id.btn9);
		
		rb1 = (RadioButton)findViewById(R.id.rb1);
		rb2 = (RadioButton)findViewById(R.id.rb2);
		
		
		btnplus = (Button)findViewById(R.id.btnplus);
		btnmns = (Button)findViewById(R.id.btnmns);
		btntms = (Button)findViewById(R.id.btntms);
		btndiv = (Button)findViewById(R.id.btndiv);
		
		btndot = (Button)findViewById(R.id.btndot);
		btneqls = (Button)findViewById(R.id.btneqls);
		btnexit = (Button)findViewById(R.id.btnexit);
		btnrst = (Button)findViewById(R.id.btnrst);
		tv2 = (TextView)findViewById(R.id.tv2);
		
		btnmns.setEnabled(false);
		btntms.setEnabled(false);
		btndiv.setEnabled(false);
		
		
		
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);

		btndot.setEnabled(false);
		btnplus.setEnabled(false);
		btnexit.setEnabled(false);
		btneqls.setEnabled(false);

		rb2.setEnabled(true);
		rb1.setEnabled(false);
		
		
		
		
		
		rb1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btndot.setEnabled(false);
				btnplus.setEnabled(false);
				btnexit.setEnabled(false);
				btneqls.setEnabled(false);
				
				rb2.setEnabled(true);
				rb1.setEnabled(false);
				
				tv.setText("");
				tv3.setText("");
				
				c=0;x=0;
			}
		});
		
		rb2.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					btn1.setEnabled(true);
					btn2.setEnabled(true);
					btn3.setEnabled(true);
					btn4.setEnabled(true);
					btn5.setEnabled(true);
					btn6.setEnabled(true);
					btn7.setEnabled(true);
					btn8.setEnabled(true);
					btn9.setEnabled(true);

					btndot.setEnabled(true);
					btnplus.setEnabled(true);
					btnexit.setEnabled(true);
					btneqls.setEnabled(true);

					rb2.setEnabled(false);
					rb1.setEnabled(true);
				}
			});
		
		
		btn1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				 
				btnplus.setEnabled(true);
				tv.setText(tv.getText()+   "1");
				tv3.setText(tv3.getText()+   "1");
			}
		});
		
		btn2.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
                	btnplus.setEnabled(true);
					tv.setText(tv.getText()+    "2");
					tv3.setText(tv3.getText()+   "2");
				}
			});
			
		btn3.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
                	btnplus.setEnabled(true);
					tv.setText( tv.getText()+  "3");
					tv3.setText(tv3.getText()+   "3");
				}
			});
			
		btn4.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					btnplus.setEnabled(true);
					tv.setText(  tv.getText()+  "4");
					tv3.setText(tv3.getText()+   "4");
				}
			});
		btn5.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					btnplus.setEnabled(true);
					tv.setText(tv.getText()+    "5");
					tv3.setText(tv3.getText()+   "5");
				}
			});
			
		btn6.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					btnplus.setEnabled(true);
					tv.setText( tv.getText()+   "6");
					tv3.setText(tv3.getText()+   "6");
				}
			});
			
		btn7.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					btnplus.setEnabled(true);
					tv.setText( tv.getText()+   "7");
					tv3.setText(tv3.getText()+   "7");
				}
			});
			
		btn8.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					btnplus.setEnabled(true);
					tv.setText( tv.getText()+   "8");
					tv3.setText(tv3.getText()+   "8");
				}
			});
			
		btn9.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					btnplus.setEnabled(true);
					tv.setText(tv.getText()+    "9");
					tv3.setText(tv3.getText()+   "9");
				}
			});
		btnplus.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					
					num=Double.parseDouble(((tv.getText().toString())));
					tv.setText( "+");
					if(c==1){
						tv3.setText("" + "+");
						tv3.setText("Ans" + tv3.getText());
					}
					else{
						tv3.setText(tv3.getText()+   "+");
					}
					
					calculation = 1;
					btndot.setEnabled(true);
					btnplus.setEnabled(false);
				}
			});
			
		btnmns.setOnClickListener(new OnClickListener(){
				public void onClick(View v){

					num=Double.parseDouble(((tv.getText().toString())));
					tv.setText( "-");
					calculation = 2;

				}
			});
			
		btntms.setOnClickListener(new OnClickListener(){
				public void onClick(View v){

					num=Double.parseDouble(((tv.getText().toString())));
					tv.setText( "*");
					calculation = 3;

				}
			});
			
		btndiv.setOnClickListener(new OnClickListener(){
				public void onClick(View v){

					num=Double.parseDouble(((tv.getText().toString())));
					tv.setText( "/");
					calculation = 4;

				}
			});
			
		
		btneqls.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					c=1;y=1;
					arithmetic_operation();
					
					tv3.setText(tv3.getText()+   "=");
					x++;
					if(x>=1){
						tv3.setText("=" + tv.getText());
					}
					
					
					
					btndot.setEnabled(false);
					btnplus.setEnabled(true);
					
					
				}
			});
			
		btnexit.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					tv.setText("");
					tv3.setText("");
					btndot.setEnabled(true);
					c=0;
					x=0;
				}
			});
			
		btnrst.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
				finishAndRemoveTask();
				}
			});
			
		btndot.setOnClickListener(new OnClickListener(){
				public void onClick(View v){

					tv.setText( tv.getText()+   ".");
					tv3.setText( tv3.getText()+   ".");
					btndot.setEnabled(false);
				}
			});
    }

	
}

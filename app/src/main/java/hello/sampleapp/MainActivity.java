package hello.sampleapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * MainActivity은 Activity라는 클래스를 상속하며 View.OnClickListener 라는 인터페이스를 구현하는 클래스입니다
 */
public class MainActivity extends Activity implements View.OnClickListener {


    /**
     * MainActivity는 아래와 같은 클래스 내부 변수를 가집니다
     * 처음에는 모두 null 값이라는 점을 기억해야 합니다
     */
    TextView myTextView;
    Button myButton;
    Button mySecondButton;


    @Override
    public void onClick(View view)
    {   //onClick 은 어떤 뷰가 클릭되었을 때 호출되고, view라는 파라미터는
        //실제로 클릭된 객체이다

        //무언가 클릭 되었고, 그게 view라는 걸 알 때
        if(myButton == view)
        {
            myTextView.setText("My Button Clicked");
        }else if(mySecondButton == view)
        {

            myTextView.setText("My Second Button Clicked");
        }
    }


    /**
     * onCreate() 메소드는 안드로이드 내부적으로
     * 이 액티비티(화면)의 객체 생성되는 시점에 한번 호출됩니다
     * 보통 액티비티에 대한 초기화등을 수행하게 됩니다
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Activity 클래스에 기존 구현된 onCreate()메소드도 정상적으로 호출해줍니다
        super.onCreate(savedInstanceState);
        //액티비티 객체가 생성 되었을 때

        //레이아웃 읽어서 화면 그리기
        setContentView(R.layout.activity_main);


        // 액티비티의 findViewById는 xml을 통해 구성한 화면에서 xml파알에서 지정한 해당 View 객체를 반환합니다
        myTextView =  (TextView)findViewById(R.id.my_text_view);

        //TextView와 Button 클래스는 setText 메소드를 통하여 내용을 지정할 수 있습니다
        myTextView.setText("HiHiHi");

        myButton = (Button)findViewById(R.id.my_bottom_button);
        myButton.setText("hi");

        //this -> MainActivity의 객체 implements OnClickListener
        myButton.setOnClickListener(this);


        mySecondButton = (Button) findViewById(R.id.my_second_button);


        /**
         * View와 그 하위 클래스의 객체들은 setOnClickListener라는 메소드를 가지고 있습니다
         * 이 메소드는 OnClickListener라는 인터페이스를 구현한 클래스의 객체를 파라미터로 받습니다
         * 내부적으로는 해당 객체를 기억하고 있다가, 이 View가 클릭되었을 때 아까 전달받은 객체의 onClick()메소드를 호출해줍니다
         * 이 때 onClick(View v) 메소드의 파라미터로 자기 자신을 반환합니다
         */
        mySecondButton.setOnClickListener(this);


//        mySecondButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }


    /**
     * 화면이 보이지 않던 상태에서 다시 보이는 상태로 전환되는 시점에 호출되는 메소드입니다
     */
    @Override
    protected void onResume() {
        super.onResume();

        //화면이 보여졌을 때
    }


    /**
     * 화면이 보이지 않는 상태로 전환되려는 시험에 호출됩니다
     */
    @Override
    protected void onPause() {
        super.onPause();
        //화면이 가려질때 해야할 일들


    }


    /**
     * 액티비티 객체가 사라질 때 호출됩니다
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();

        //화면이 사라질때


    }

}

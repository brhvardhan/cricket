 package com.example.android.cricket;
    import java.text.NumberFormat;
    import android.os.Bundle;
    import android.support.v7.app.ActionBarActivity;
    import android.view.View;
    import android.widget.CheckBox;
    import android.widget.EditText;
    import android.widget.TextView;

    /**
     * This app displays an order form to order coffee.
     */

    public class MainActivity extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        int score=0;
        int ball=0;
        int wicket=0;

    public void one(View view)
    {   if( checkWickets(wicket))
       { score += 1;
        ball += 1;
        editScore(score);
        editBall(ball);}
    }

        public void two(View view)
        {   if( checkWickets(wicket)){
            score += 2;
            ball += 1;
            editScore(score);
            editBall(ball);}
        }
        public void three(View view)
        {   if( checkWickets(wicket)){
            score += 3;
            ball += 1;
            editScore(score);
            editBall(ball);}
        }
        public void four(View view)
        {   if( checkWickets(wicket)){
            score += 4;
            ball += 1;
            editScore(score);
            editBall(ball);}
        }
        public void six(View view)
        {   if( checkWickets(wicket)){
            score += 6;
            ball += 1;
            editScore(score);
            editBall(ball);}
        }
        public void wide(View view)
        {   if( checkWickets(wicket)){
            score += 1;
            editScore(score);}
        }
        public void noBall(View view)
        {   if( checkWickets(wicket)){
            score += 1;
            editScore(score);}
        }
        public void out(View view)
        {
           wicket += 1;
           if( checkWickets(wicket))
           {    ball += 1;
               editWickets(wicket);
                editBall(ball);}
        }
        public void reset(View view)
        {
            wicket = 0;
            score = 0;
            ball = 0;
            editScore(wicket);
            editBall(ball);
            editWickets(wicket);
        }
        public void editScore(int var)
        {TextView scoresTextView = (TextView) findViewById(R.id.scores);
            scoresTextView.setText(" "+score);
        }
        public void editBall(int var)
        {TextView ballsTextView = (TextView) findViewById(R.id.balls);
            int overs=ball/6;
            ballsTextView.setText(" " + overs +"."+ ball%6 );}
        public void editWickets(int var)
        {TextView wicketsTextView = (TextView) findViewById(R.id.wickets);
            wicketsTextView.setText(" " + wicket);}
        public boolean checkWickets(int var)
        {   int overs=ball/6;
            if(var>9)
            {TextView wicketsTextView = (TextView) findViewById(R.id.wickets);
                wicketsTextView.setText(":10\nMatch has been completed\n");
            return false;}
            else
                return true;
        }
}

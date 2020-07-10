package com.michaelmagdy.ebookshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddAndEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_and_edit);
    }

    public class AddAndEditActivityClickHandlers{
        Context context;

        public AddAndEditActivityClickHandlers(Context context) {
            this.context = context;
        }

        public void onSubmitButtonClicked(View view){
//            if(book.getBookName()==null){
//                Toast.makeText(context,"Name field cannot be empty",Toast.LENGTH_LONG).show();
//            }else{
//                Intent intent=new Intent();
//                intent.putExtra(BOOK_NAME,book.getBookName());
//                intent.putExtra(UNIT_PRICE,book.getUnitPrice());
//                setResult(RESULT_OK,intent);
//                finish();
//            }
            Toast.makeText(context, "submit button", Toast.LENGTH_SHORT).show();


        }
    }
}

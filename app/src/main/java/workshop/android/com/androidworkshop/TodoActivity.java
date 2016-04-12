package workshop.android.com.androidworkshop;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class TodoActivity extends ActionBarActivity {


    ArrayAdapter<String> listAdapter;
    ArrayList<String> list = new ArrayList<String>();

    ListView mListView;
    Button btnSave;
    EditText textFieldTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        initViews();
        list.add("hi");

        list.add("jo");
        listAdapter=new ArrayAdapter<String>
                (this, andriod.R.layout.simple_list_item_1,
                        list);
        mListView.setAdapter(listAdapter);
    }

    private void initViews(){
        mListView=(ListView)findViewById(R.id.listView);
        btnSave = (Button)findViewById(R.id.btnSave);
        textFieldTodo=(EditText)findViewById(R.id.textFieldToDo);
    }
    public void onButtonClick(View view){
        list.add(textFieldTodo.getText().toString());
        listAdapter.notifyDataSetChanged();
    }
}

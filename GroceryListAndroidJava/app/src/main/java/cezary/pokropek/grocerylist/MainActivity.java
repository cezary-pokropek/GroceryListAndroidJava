package cezary.pokropek.grocerylist;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private AlertDialog.Builder builder;
    private AlertDialog dialog;
    private Button saveButton;
    private EditText shopItem;
    private EditText itemQuantity;
    private EditText itemColor;
    private EditText itemSize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TODO: making saving functionallity work
//    saveButton = findViewById(R.id.saveButton);
//    saveButton.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            saveItem();
//        }
//    });

    FloatingActionButton fab = findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            createPopupDialog();
        }
    });

    }

    private void saveItem() {
        //TODO: save each item to db
        //TODO: move to next screen - details screen



    }

    private void createPopupDialog() {

        builder = new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.popup, null);

        shopItem = view.findViewById(R.id.shopItem);
        itemQuantity = view.findViewById(R.id.itemQuantity);
        itemColor = findViewById(R.id.itemColor);
        itemSize = findViewById(R.id.itemSize);

        builder.setView(view);
        dialog = builder.create(); // creating dialog object
        dialog.show();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

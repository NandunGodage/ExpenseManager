package CashMate.com.CashMate.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import CashMate.com.CashMate.R;
import CashMate.com.CashMate.database.ExpenseDatabaseHelper;
import CashMate.com.CashMate.presenter.CategoryPresenter;
import CashMate.com.CashMate.view.AddCategoryView;

import static CashMate.com.CashMate.activity.MainActivity.ADD_NEW_CAT;


public class AddCategoryActivity extends FragmentActivity implements AddCategoryView {

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.new_category);
  }

  public void addCategory(View view) {
    ExpenseDatabaseHelper expenseDatabaseHelper = new ExpenseDatabaseHelper(this);
    CategoryPresenter categoryPresenter = new CategoryPresenter(this, expenseDatabaseHelper);

    if(categoryPresenter.addCategory())
      Toast.makeText(this, getString(R.string.add_category_success), Toast.LENGTH_LONG).show();

    expenseDatabaseHelper.close();
    finishActivity(ADD_NEW_CAT);
  }

  @Override
  public String getCategory() {
    TextView categoryInput = (TextView) findViewById(R.id.category);
    return categoryInput.getText().toString();
  }

  @Override
  public void displayError() {
    TextView view = (TextView) this.findViewById(R.id.category);
    view.setError(this.getString(R.string.category_empty_error));
  }
}

package CashMate.com.CashMate.presenter;

import CashMate.com.CashMate.database.ExpenseDatabaseHelper;
import CashMate.com.CashMate.model.ExpenseType;
import CashMate.com.CashMate.view.AddCategoryView;

public class CategoryPresenter {
  private final AddCategoryView view;
  private final ExpenseDatabaseHelper database;

  public CategoryPresenter(AddCategoryView view, ExpenseDatabaseHelper database) {
    this.view = view;
    this.database = database;
  }

  public boolean addCategory() {
    String newCategory = view.getCategory();
    if(newCategory.isEmpty()){
      view.displayError();
      return false;
    }

    database.addExpenseType(new ExpenseType(newCategory));
    return true;
  }
}

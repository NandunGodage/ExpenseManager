package CashMate.com.CashMate.view;

import java.util.List;

import CashMate.com.CashMate.model.Expense;

public interface TodaysExpenseView {
  void displayTotalExpense(Long totalExpense);
  void displayTodaysExpenses(List<Expense> expenses);
}

package CashMate.com.CashMate.view;

import java.util.List;
import java.util.Map;

import CashMate.com.CashMate.model.Expense;

public interface CurrentWeekExpenseView {
  void displayCurrentWeeksExpenses(Map<String, List<Expense>> expensesByDate);

  void displayTotalExpenses(Long totalExpense);
}

package CashMate.com.CashMate.view;


import androidx.fragment.app.Fragment;

public interface NavigationDrawerItemView {
    void render(Fragment fragment);

    void goToHome();
}

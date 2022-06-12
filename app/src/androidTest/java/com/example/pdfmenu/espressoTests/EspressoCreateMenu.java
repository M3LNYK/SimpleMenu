package com.example.pdfmenu.espressoTests;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.pressMenuKey;
import static androidx.test.espresso.assertion.PositionAssertions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import android.widget.HorizontalScrollView;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.pdfmenu.ADGC_Activity;
import com.example.pdfmenu.CreateMenuActivity;
import com.example.pdfmenu.R;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EspressoCreateMenu {
    @Rule
    public ActivityScenarioRule<CreateMenuActivity> activityScenarioRule = new ActivityScenarioRule<CreateMenuActivity>(CreateMenuActivity.class);

    @Test
    public void textView_isDisplayed() {
        onView(withId(R.id.textView2)).check(matches(isDisplayed()));
    }
}

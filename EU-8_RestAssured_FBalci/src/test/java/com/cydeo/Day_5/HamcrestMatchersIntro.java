package com.cydeo.Day_5;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersIntro {

    @DisplayName("Assertion with numbers")
    @Test
    public void simpleTest1(){

        assertThat(5+5, is(10));
        assertThat(5+5,equalTo(10));
        assertThat(5+5,is(equalTo(10)));

        assertThat(5+5,not(9));
        assertThat(5+5,is(not(9)));
        assertThat(5+5,is(not(equalTo(9))));

        //number comparison

        assertThat(5+5,is(greaterThan(9)));
        assertThat(5+5,is(lessThanOrEqualTo(9)));
        assertThat(5+5,is(greaterThanOrEqualTo(8)));

    }
    @DisplayName("Assertion with String")
    @Test
    public void simpleTest2(){

        String text = "EU8 is learning Hamcrest";

        assertThat(text, is("EU8 is learning Hamcrest"));
        assertThat(text,equalTo("EU8 is learning Hamcrest"));
        assertThat(text, is(equalTo("EU8 is learning Hamcrest")));
        assertThat(text, not("EU8 is learning Hamcr"));
        assertThat(text,is(not("EU is learning Hamcrest")));


        assertThat(text,startsWith("EU"));
        assertThat(text, startsWithIgnoringCase("eu"));
        assertThat(text, is(containsString("is learning")));
        assertThat(text, is(containsStringIgnoringCase("is Learning").toString()));

    }

    @DisplayName("Hamcrest for Collection")
    @Test
    public void simpleTest3(){

        List<Integer> listOfNumbers = Arrays.asList(1,2,4,5,6,45,76,34,26);

        assertThat(listOfNumbers,hasSize(9));

        assertThat(listOfNumbers, hasItem(26));

        assertThat(listOfNumbers,everyItem(greaterThan(0)));




    }

}

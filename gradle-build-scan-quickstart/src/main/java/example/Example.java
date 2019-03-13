package example;

import com.google.common.base.Joiner;

public class Example {

    public static String join(String... args) {
        return Joiner.on(' ').join(args);
    }

    public void Test()
    {

	UtilOne one=new UtilOne();
        one.UtilOneTest();

        UtilTwo two=new UtilTwo();
	two.UtilTwoTest();

    }

}

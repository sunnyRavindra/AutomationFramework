package listeners;

import java.lang.reflect.Method;

import org.openqa.selenium.support.events.WebDriverListener;

public class TestWebDriverListener implements WebDriverListener{

	@Override
	public void beforeAnyCall(Object target, Method method, Object[] args) {
		System.out.println("Before Any Call");
	}

}

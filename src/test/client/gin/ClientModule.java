package test.client.gin;

import test.client.start.TestPresenter;
import test.client.start.TestView;

import com.gwtplatform.common.client.CommonGinModule;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new CommonGinModule()); 
		
		install(new DefaultModule());
		
 

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.start);
		bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.start);
		bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.start);
		
 
		

    bindPresenter(TestPresenter.class, TestPresenter.MyView.class, TestView.class, TestPresenter.MyProxy.class);
	}
}

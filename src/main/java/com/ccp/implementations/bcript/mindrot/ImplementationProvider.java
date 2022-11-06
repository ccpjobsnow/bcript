package com.ccp.implementations.bcript.mindrot;

import com.ccp.dependency.injection.CcpImplementationProvider;

public class ImplementationProvider implements CcpImplementationProvider {

	@Override
	public Object getImplementation() {
		return new PasswordMindrot();
	}

}

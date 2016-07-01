package com.humano.care.util;

import java.io.Serializable;

public class Request<GenericData> implements Serializable {

	private static final long serialVersionUID = 1L;

	private GenericData requestData;

	/**
	 * @return the requestData
	 */
	public GenericData getRequestData() {
		return requestData;
	}

	/**
	 * @param requestData the requestData to set
	 */
	public void setRequestData(GenericData requestData) {
		this.requestData = requestData;
	}

}

package com.iluwatar.intercepting.filter;

/**
 * Filter Manager manages the filters and Filter Chain.
 * 
 * @author joshzambales
 *
 */
public class FilterManager {
	
	private FilterChain filterChain;

	public FilterManager(Target target) {
		filterChain = new FilterChain(target);
	}

	public void addFilter(IFilter filter) {
		filterChain.addFilter(filter);
	}

	public String filterRequest(Order order) {
		return filterChain.execute(order);
	}
}

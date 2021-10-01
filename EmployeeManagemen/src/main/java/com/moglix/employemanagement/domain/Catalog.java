package com.moglix.employemanagement.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Catalog implements Comparable<Catalog> {
	private Long productId;
	private Long categoryId;
	private String productName;
	private String productDescription;
	private String productImage;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalog other = (Catalog) obj;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}

	public Catalog(Long productId, String productName, String productDescription, Long categoryId) {
		
		this.productId = productId;
		this.categoryId = categoryId;
		this.productName = productName;
		this.productDescription = productDescription;

	}

	
	@Override
	public int compareTo(Catalog o) {
	return  this.productId.compareTo(o.getProductId());
		
	}

}

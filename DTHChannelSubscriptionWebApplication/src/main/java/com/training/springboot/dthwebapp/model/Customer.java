package com.training.springboot.dthwebapp.model;



import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.validation.constraints.Size;


@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="addcustomer",procedureName = "addcustomer")})
public class Customer {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Size(min=10,max=10)
		private Long subscriber_id;
		@Size(min=10,max=10)
		private Long registered_mobile;
		private String first_name;
		private String last_name;
		
	
		public Customer() {
			System.out.println("Customer default constructor");
		}

		public Customer(@Size(min = 10, max = 10) @Size(min = 10, max = 10) Long subscriber_id,
				@Size(min = 10, max = 10) Long registered_mobile, String first_name, String last_name) {
			super();
			this.subscriber_id = subscriber_id;
			this.registered_mobile = registered_mobile;
			this.first_name = first_name;
			this.last_name = last_name;
			
		}

		public @Size(min = 10, max = 10) Long getSubscriber_id() {
			return subscriber_id;
		}

		public void setSubscriber_id(@Size(min = 10, max = 10) Long subscriber_id) {
			this.subscriber_id = subscriber_id;
		}

		public Long getRegistered_mobile() {
			return registered_mobile;
		}

		public void setRegistered_mobile(Long registered_mobile) {
			this.registered_mobile = registered_mobile;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		@Override
		public String toString() {
			return "Customer [subscriber_id=" + subscriber_id + ", registered_mobile=" + registered_mobile
					+ ", first_name=" + first_name + ", last_name=" + last_name+ "]";
		}
		
		
		
		

}

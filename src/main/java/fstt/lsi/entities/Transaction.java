package fstt.lsi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Transactions")
public class Transaction {
	
	@Id
	private String transactionId;
	private String byerAddress;
//	private long propertyId;
	//many to one
//	@DBRef
//	private Property property;

}

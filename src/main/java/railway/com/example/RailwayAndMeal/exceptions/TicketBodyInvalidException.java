package railway.com.example.RailwayAndMeal.exceptions;

import org.springframework.validation.BindingResult;

;

/**
     1. Add proper annotation for this custom exception class
     2. It returns a response status of type BAD_REQUEST.
 */
public class TicketBodyInvalidException extends RuntimeException {

    //complete the method body for TicketBodyInvalidException constructor
	

	    public TicketBodyInvalidException(BindingResult result) {
	      super();
	      }
}

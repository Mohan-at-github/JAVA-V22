package LLD_03.Parking_Lot.Exceptions;

public class InvalidRequestException extends RuntimeException{
        public InvalidRequestException(String message)
        {
                super(message);
        }

}
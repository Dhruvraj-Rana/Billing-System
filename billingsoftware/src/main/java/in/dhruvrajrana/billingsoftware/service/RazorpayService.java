package in.dhruvrajrana.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.dhruvrajrana.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}

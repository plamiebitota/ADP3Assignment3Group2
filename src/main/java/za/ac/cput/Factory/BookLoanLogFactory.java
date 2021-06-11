package za.ac.cput.Factory;

import za.ac.cput.Entity.BookLoanLog;
import za.ac.cput.Util.GenericHelper;

/*
    Author: Ruphin Bolonda
    Student Number: 218321392
    Description: BookLoanLogFactory class
 */

public class BookLoanLogFactory {
    public static BookLoanLog createBookLoanLog(String lentFromDate,String lentToDate,boolean isCheckOut){
        if(lentFromDate.isEmpty() || lentToDate.isEmpty()){
            return null;
        }
        String bookLoanLogId = GenericHelper.generateId();
        String userId = GenericHelper.generateId();
        String bookId = GenericHelper.generateId();

        BookLoanLog bookLoanLog = BookLoanLog.bookLoanLogBuilder()
                                    .withBookLoanLogId(bookLoanLogId)
                                    .withUserId(userId)
                                    .withBookId(bookId)
                                    .withLentFromDate(lentFromDate)
                                    .withLentToDate(lentToDate)
                                    .withCheckOut(isCheckOut)
                                    .build();
        return bookLoanLog;

    }


}
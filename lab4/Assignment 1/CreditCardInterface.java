import java.io.*;
interface CreditCardInterface
{
	void viewCreditAmount();
	void useCard() throws IOException;
	void payCredit() throws IOException;
	void increaseLimit();// throws IOException;
}

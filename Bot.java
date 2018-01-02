package bot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;

/**
 *
 * @author White
 */
public class Bot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    @SuppressWarnings("deprecation") // Означает то, что в новых версиях метод уберут или заменят
	private void sendMsg(Message msg, String text) {
		SendMessage s = new SendMessage();
		s.setChatId(msg.getChatId()); // Боту может писать не один человек, и поэтому чтобы отправить сообщение, грубо говоря нужно узнать куда его отправлять
		s.setText(text);
		try { //Чтобы не крашнулась программа при вылете Exception 
			sendMessage(s);
		} catch (TelegramApiException e){
			e.printStackTrace();
		}
	}

    private void sendMessage(SendMessage s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

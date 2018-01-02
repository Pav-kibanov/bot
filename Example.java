package bot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.LongPollingBot;

public class Example extends TelegramLongPollingBot{
        public static void main(String[] args) {
	ApiContextInitializer.init(); // Инициализируем апи
	TelegramBotsApi botapi = new TelegramBotsApi();
	try {
		botapi.registerBot((LongPollingBot) new Bot());
	} catch (TelegramApiException e) {
		e.printStackTrace();
	}
        }
	public String getBotUsername() {
		return "ChertanovoBot";
                //возвращаем юзера
	}

	public void onUpdateReceived(Update e) {
		// Тут будет то, что выполняется при получении сообщения
	}

	@Override
	public String getBotToken() {
		return "416562058:AAFrxflYFSFsoBYvWacQioqEgQxVlh9h0mg";
                //Токен бота
	}

}

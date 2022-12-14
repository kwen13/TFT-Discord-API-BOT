package Main;

import javax.security.auth.login.LoginException;

import Commands.TFT;
import Events.RespondEvent;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Bot {
	
	public static void main(String args[]) throws LoginException, InterruptedException {
		JDABuilder jda = JDABuilder.createDefault("TokenKey");
		
		jda.enableIntents(GatewayIntent.MESSAGE_CONTENT);
		jda.setActivity(Activity.watching("!help"));
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new RespondEvent());
		jda.addEventListeners(new TFT());
		jda.build();
		
	}
	
}

import java.util.logging.ConsoleHandler
import java.util.logging.FileHandler
import java.util.logging.SimpleFormatter
import java.util.logging.LogManager
import jenkins.model.Jenkins

// Log into the console
def WebAppMainLogger = LogManager.getLogManager().getLogger("hudson.WebAppMain")
WebAppMainLogger.addHandler (new ConsoleHandler())



public class Logger {
	private ILogger _logger;
	public Logger(ILogger _logger) {
		// TODO Auto-generated constructor stub
		this._logger = _logger;
	}
	public void log_msg(String msg) {
		_logger.log(msg);
	}
}

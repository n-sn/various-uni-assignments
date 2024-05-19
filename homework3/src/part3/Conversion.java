package part3;

public class Conversion {
	
	private LStack<String> stack;
	private String output;
	
	public Conversion() {
		stack = new LStack<String>();
		output = "";
	}
	
	private boolean isOperator(String letter) {
		if (letter.equals("+") || letter.equals("-") || letter.equals("*") || letter.equals("/") ) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isOperand(String letter) { 
		return Character.isDigit(letter.charAt(0));
	}
	
	private int precedence(String letter) {
		if (letter.equals("+") || letter.equals("-")) {
			return 0;
		} else if (letter.equals("*") || letter.equals("/")) {
			return 1;
		}
		return -1;
	}
	
	private boolean isHigherOrEqual(String operator1, String operator2) {
		if (precedence(operator1) >= precedence(operator2)) {
			return true;
		} else {
			return false;
		}
	}
	
	private void sendOutput(String data) {
		output += data + " ";
	}
	
	private double doMath(String operator, double num1, double num2) {
		double result = 0;
		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}
	
	
	public String infixToPostfix(String infix) {
		
		LStack<String> infixStack = new LStack<String>();
		String[] tokens = infix.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			if (isOperand(tokens[i])) {
				sendOutput(tokens[i]);
			}	else if (isOperator(tokens[i])) {
				if (infixStack.isEmpty()) {
					infixStack.push(tokens[i]);
				}	else if (precedence(tokens[i]) <= precedence(infixStack.peek())) {
					//while (infixStack.isEmpty() && (precedence(tokens[i]) <= precedence(infixStack.peek())))  {
						sendOutput(infixStack.pop());
					//}
						if (!infixStack.isEmpty() && (precedence(tokens[i]) <= precedence(infixStack.peek()))) {
							sendOutput(infixStack.pop());
						}
					infixStack.push(tokens[i]);
				}	else {
					infixStack.push(tokens[i]);	
				}
			}
		}
		while (!infixStack.isEmpty()) {
			sendOutput(infixStack.pop());
		}
		return output;
	}
	
	
	
	public double evaluate(String postfix) {
		LStack<Double> evalStack = new LStack<Double>();
		String[] tokens = postfix.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			if (isOperand(tokens[i])) {
				evalStack.push(Double.parseDouble(tokens[i]));
			}	else if (isOperator(tokens[i])) {
				double num2 = evalStack.pop();
				double num1 = evalStack.pop();
				evalStack.push(doMath(tokens[i], num1, num2));
			}
		}
		
		return evalStack.pop();
	}
	
	
}

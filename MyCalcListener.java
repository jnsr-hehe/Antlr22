import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiler.CalcBaseListener;
import compiler.CalcParser;

public class MyCalcListener extends CalcBaseListener {
    Map<CalcParser.MulExprContext, Integer> m_mulExprResultMap = new HashMap<CalcParser.MulExprContext, Integer>();
    
    @Override public void exitMulExpr(CalcParser.MulExprContext ctx) {
        // get list of numbers
        List<TerminalNode> numberList = ctx.NUMBER();
        Iterator<TerminalNode> numberListIter = numberList.iterator();
        // for each number
        int result = 1;
        while (numberListIter.hasNext()) {
            // multiply with result
            TerminalNode numberTerminal = numberListIter.next();
            String numberText = numberTerminal.getText();
            int number = Integer.parseInt(numberText);
            result = result * number;            
        }
        m_mulExprResultMap.put(ctx, result);
    }

    @Override public void exitSumExpr(CalcParser.SumExprContext ctx) {
        // get list of numbers
        List<CalcParser.MulExprContext> mulExprList = ctx.mulExpr();
        Iterator<CalcParser.MulExprContext> mulExprListIter = mulExprList.iterator();
        // for each number
        int result = 0;
        while (mulExprListIter.hasNext()) {
            // multiply with result
            CalcParser.MulExprContext mulExpr = mulExprListIter.next();
            int value = m_mulExprResultMap.get(mulExpr);
            result = result + value;            
        }
        System.out.println(result);
    }

    
}

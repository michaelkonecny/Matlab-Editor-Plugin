package at.justin.matlab;

import at.justin.matlab.editor.MEPActionE;
import at.justin.matlab.editor.MEPKeyStrokesE;
import at.justin.matlab.util.RunnableUtil;
import com.mathworks.mde.cmdwin.XCmdWndView;

import javax.swing.*;

/** Created by Andreas Justin on 2016-09-15. */
public class CommandWindow {
    private static final int WF = JComponent.WHEN_FOCUSED;

    public static void setCallbacks() {
        // CmdWin cmdWin = CmdWin.getInstance();
        // getXCmdWndView().addKeyListener(KeyReleasedHandler.getKeyListener());

        getXCmdWndView().getInputMap(WF).put(MEPKeyStrokesE.KS_MEP_DEBUG.getKeyStroke(), "MEP_DEBUG");
        getXCmdWndView().getActionMap().put("MEP_DEBUG", MEPActionE.MEP_DEBUG.getAction());

        getXCmdWndView().getInputMap(WF).put(MEPKeyStrokesE.KS_MEP_SHOW_COPY_CLIP_BOARD.getKeyStroke(), "MEP_SHOW_CLIP_BOARD_STACK");
        getXCmdWndView().getActionMap().put("MEP_SHOW_CLIP_BOARD_STACK", MEPActionE.MEP_SHOW_CLIP_BOARD_STACK.getAction());

        //// FIXME: 2016-10-12 cancels CTRL + C feature, so no more canceling execution
        // getXCmdWndView().getInputMap(WF).put(MEPKeyStrokesE.KS_MEP_COPY_CLIP_BOARD.getKeyStroke(), "MEP_COPY_CLIP_BOARD_CMD");
        // getXCmdWndView().getActionMap().put("MEP_COPY_CLIP_BOARD_CMD", MEPActionE.MEP_COPY_CLIP_BOARD_CMD.getAction());
    }

    public static String getSelectedTxt() {
        return getXCmdWndView().getSelectedText();
    }

    public static void insertTextAtPos(final String string, final int pos) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                CommandWindow.getXCmdWndView().insert(string, pos);
            }
        };
        RunnableUtil.invokeInDispatchThreadIfNeeded(runnable);
    }

    public static int getCaretPosition() {
        return getXCmdWndView().getCaretPosition();
    }

    public static XCmdWndView getXCmdWndView() {
        return XCmdWndView.getInstance();
    }
}

package JavaConceptPracties.SipPracties;
import javax.servlet.sip.SipServletRequest;


public class HomeProxyServlet {


    public void handle(SipServletRequest req) {
        System.out.println("Rajjj: inside SessionKeepAliveHandler.handle");
/*        int incomingSE;
        Refresher refresher;
        String hdrSE = req.getHeader(SESSION_EXPIRES_HDR);
        if (hdrSE == null) {
            return ;
        } else {
            SessionExpires se = new SessionExpires(hdrSE);
            incomingSE = se.value;
            refresher = se.refresher;
            int incomingMinSE = getMinSE(req);

            Preference keepAlivePrefer = req.getSessionKeepAlivePreference();
            keepAlivePrefer.setEnabled(true);
            keepAlivePrefer.setMinimumExpiration(incomingMinSE);
            keepAlivePrefer.setExpiration(incomingSE);
            keepAlivePrefer.setRefresher(refresher);

            SessionKeepAlive keepAlive = req.getSession().getKeepAlive();
            keepAlive.setExpiryCallback( (session) -> {if(session != null) session.invalidate();} );
        }*/
    }

}

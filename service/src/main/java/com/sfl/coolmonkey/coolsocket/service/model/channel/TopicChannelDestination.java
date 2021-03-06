package com.sfl.coolmonkey.coolsocket.service.model.channel;

/**
 * User: Arthur Asatryan.
 * Company: SFL LLC
 * Date: 23/05/16
 * Time: 16:47
 */
public enum TopicChannelDestination {
    //region Properties
    TIME_TRACKING_UPDATED("/topic/reporting/");

    private final String destination;
    //endregion

    //region Constructors
    TopicChannelDestination(final String destination) {
        this.destination = destination;
    }
    //endregion

    //region Properties getters and setters
    public String getDestination() {
        return destination;
    }
    //endregion
}

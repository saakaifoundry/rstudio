/*
 * ConsoleRestartRCompleted.java
 *
 * Copyright (C) 2009-12 by RStudio, Inc.
 *
 * This program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.console.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class ConsoleRestartRCompletedEvent extends GwtEvent<ConsoleRestartRCompletedEvent.Handler>
{
   public interface Handler extends EventHandler
   {
      void onRestartRCompleted(ConsoleRestartRCompletedEvent event);
   }

   public ConsoleRestartRCompletedEvent()
   {
   }

   @Override
   public Type<Handler> getAssociatedType()
   {
      return TYPE;
   }

   @Override
   protected void dispatch(Handler handler)
   {
      handler.onRestartRCompleted(this);
   }

   public static final Type<Handler> TYPE = new Type<Handler>();
}

package com.eclipsesource.firebase.messaging;

import android.app.Activity;

import com.eclipsesource.tabris.android.TabrisContext;
import com.eclipsesource.tabris.android.TabrisPropertyHandler;
import com.eclipsesource.firebase.messaging.MessagingOperator;
import com.eclipsesource.firebase.messaging.MessagingPropertyHandler;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class MessagingOperator_Test {

  private MessagingOperator operator;

  @Before
  public void setUp() {
    operator = new MessagingOperator( mock( Activity.class ), mock( TabrisContext.class ) );
  }

  @Test
  public void testGetType() {
    String type = operator.getType();

    assertThat( type ).isEqualTo( "com.eclipsesource.firebase.Messaging" );
  }

  @Test
  public void testGetPropertyHandler() {
    TabrisPropertyHandler propertyHandler = operator.getPropertyHandler( mock( Messaging.class ) );

    assertThat( propertyHandler ).isInstanceOf( MessagingPropertyHandler.class );
  }

}
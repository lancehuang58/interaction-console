package idv.lance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class PersonTest {

  private static final String NAME = "Can";

  @InjectMocks
  private Person underTest;

  @Mock
  Location location;

  @Nested
  class WhenNaming {
	@BeforeEach
	void setup() {
	  location = new Location(1, 2);
	  underTest = new Person(NAME, location);
	}

	@Test
	void name() {
	  assertThat(underTest.name()).isEqualTo(NAME);
	}
  }
}
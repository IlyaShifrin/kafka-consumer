package telran.java52.pulse.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PulseDto {

	int id;
	long timestamp;
	int payload;
	
}

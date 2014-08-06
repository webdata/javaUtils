/*
 * Copyright (C) 2014 
 *  - Dipartimento di Ingegneria informatica automatica e gestionale Antonio Ruberti, Sapienza Università di Roma, http://www.dis.uniroma1.it/
 *  - Javier D. Fernandez, <fernandez@dis.uniroma1.it>
 * 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author Javier D. Fernández
 * 
 */
public class Utils {

	public static HttpResponse putHttpWrapper(String URI, String entity, ContentType contentType) throws ClientProtocolException,
			IOException {

		HttpResponse response = null;
		HttpClient httpclient = HttpClientBuilder.create().build();
		HttpPut putRequest = new HttpPut(URI);
		StringEntity input;
		input = new StringEntity(entity, contentType);
		putRequest.setEntity(input);
		response = httpclient.execute(putRequest);
		return response;
	}
}

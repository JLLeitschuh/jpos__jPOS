/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2007 Alejandro P. Revilla
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.q2.cli;

import java.io.InputStream;
import java.io.IOException;
import org.jpos.q2.CLI;

public class COPYRIGHT implements CLI.Command {
    public void exec (CLI cli, String[] args) throws IOException {
        display (cli, MAN.class.getResourceAsStream("/COPYRIGHT"));
        cli.println ("");
    }
    private void display (CLI cli, InputStream is) throws IOException {
        if (is != null) {
            while (is.available() > 0) {
                byte[] b = new byte[is.available()];
                is.read (b);
                cli.print (new String(b, "ISO8859_1"));
            }
        }
    }
}


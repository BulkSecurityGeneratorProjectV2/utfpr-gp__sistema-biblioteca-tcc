/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model.service;

import br.edu.utfpr.model.LivroDidatico;
import br.edu.utfpr.model.dao.LivroDidaticoDAO;

/**
 *
 * @author Lucas
 */
public class LivroDidaticoService extends AbstractService<Long, LivroDidatico>
{
    public LivroDidaticoService()
    {
        dao = new LivroDidaticoDAO();
    }
    
}

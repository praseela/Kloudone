package com.example.demo.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Posting;
import com.example.demo.Repository.PostingRepository;

@RestController
public class PostingController {

	@Autowired
	private PostingRepository postrep;

	@GetMapping("/job")
	public List<Posting> index() {
		return postrep.findAll();
	}

	@GetMapping("/job/{id}")
	public Posting show(@PathVariable int id) {
		Optional<Posting> datas = postrep.findById(id);

		return datas.get();

	}

	@PostMapping("/job")
	public Posting create(@RequestBody Posting post) {
		return postrep.save(post);
	}

	@PutMapping("/job/{id}")
	public Posting update(@PathVariable int id, @RequestBody Posting post) {
		Optional<Posting> datas = postrep.findById(id);
		post.setId(id);
		postrep.save(post);
		return datas.get();
	}

	@DeleteMapping("job/{id}")
	public boolean delete(@PathVariable int id) {
		postrep.deleteById(id);
		return true;
	}

}

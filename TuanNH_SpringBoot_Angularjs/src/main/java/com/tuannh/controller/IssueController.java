package com.tuannh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taskadapter.redmineapi.IssueManager;
import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.bean.Issue;
import com.tuannh.model.IssueBean;
import com.tuannh.service.IssueService;

@RestController
@RequestMapping("/api")
public class IssueController {

	@Autowired
	IssueService issueService;

	public IssueController() {
		super();
		
	}

	// get list CardCenters

	@RequestMapping(value = "/issue/", method = RequestMethod.GET)
	public ResponseEntity<List<IssueBean>> listAll() {
		
		String uri = "http://www.redmine.org/projects/redmine";
	    String apiAccessKey = "a3221bfcef5750219bd0a2df69519416dba17fc9";
	    String projectKey = "redmine";
	    Integer queryId = null; // any

	    RedmineManager mgr = RedmineManagerFactory.createWithApiKey(uri, apiAccessKey);
	    IssueManager issueManager = mgr.getIssueManager();
	    List<Issue> issues;
		try {
			issues = issueManager.getIssues(projectKey, queryId);
			for (Issue issue : issues) {
				System.out.println(issue.toString());
				IssueBean issueBean=new IssueBean();
				issueBean.setId_issue(issue.getId());
				issueBean.setTrackerName(issue.getTracker().getName());
				issueBean.setStatusName(issue.getStatusName());
				issueBean.setSubject(issue.getSubject());
				issueBean.setUpdatedOn(issue.getUpdatedOn());
//				issueBean.setCategoryName(issue.getCategory().getName());
		        issueService.save(issueBean);
		    }
		} catch (RedmineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<IssueBean> list = issueService.getAllIssue();
		if (list.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<IssueBean>>(list, HttpStatus.OK);
	}

	// // save a CardCenter
	//
	// @RequestMapping(value = "/cardcenter/", method = RequestMethod.POST)
	// public ResponseEntity<?> createTransactionData(@RequestBody CartCenters
	// cartCenter, UriComponentsBuilder ucBuilder) {
	//
	// cardCenterService.save(cartCenter);
	//
	// HttpHeaders headers = new HttpHeaders();
	// headers.setLocation(ucBuilder.path("/api/cartcenter/{id}").buildAndExpand(cartCenter.getCardCenterId()).toUri());
	// return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	// }
	//
	// // ------------------- Update a CardCenters
	// ------------------------------------------------
	//
	// @RequestMapping(value = "/cardcenter/{id}", method = RequestMethod.PUT)
	// public ResponseEntity<?> updateUser(@PathVariable("id") UUID id, @RequestBody
	// CartCenters cartCenter) {
	//
	// CartCenters card = cardCenterService.findOne(id);
	// card.setCardCenterId(cartCenter.getCardCenterId());
	// card.setCartCenterDetails(cartCenter.getCartCenterDetails());
	// card.setAmount(cartCenter.getAmount());
	// cardCenterService.save(card);
	// return new ResponseEntity<CartCenters>(card, HttpStatus.OK);
	// }
	//
	// // ------------------- Delete a
	// CardCenters-----------------------------------------
	//
	// @RequestMapping(value = "/cardcenter/{id}", method = RequestMethod.DELETE)
	// public ResponseEntity<?> deleteUser(@PathVariable("id") UUID id) {
	//
	// CartCenters card = cardCenterService.findOne(id);
	//
	// cardCenterService.deleteById(id);
	// return new ResponseEntity<CartCenters>(HttpStatus.NO_CONTENT);
	// }
	//
	// // ------------------- Delete All CardCenters-----------------------------
	//
	// @RequestMapping(value = "/cardcenter/", method = RequestMethod.DELETE)
	// public ResponseEntity<CartCenters> deleteAll() {
	//
	// cardCenterService.deleteAll();
	// return new ResponseEntity<CartCenters>(HttpStatus.NO_CONTENT);
	// }
}